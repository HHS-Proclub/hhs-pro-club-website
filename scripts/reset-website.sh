#!/bin/bash

# public_html folder
pub="/home3/hhsprog/public_html"

# Initial setup
echo "Note: This is a convenience script. The reset requirements may change from year to year, so this might be outdated! Make sure to double check before using this script."
echo ""
echo "Please enter the current school year (ex: Enter '2020' for the 2020-21 school year)..."
read year
next_year=$((year+1))

echo ""
echo "*** IMPORTANT: Make sure the below information is correct before continuing! ***"
echo "Current year: ${year}"
echo "Next year: ${next_year}"
echo "public_html folder: ${pub}"
echo ""
echo "Type 'confirm' to begin the reset, or anything else to abort."
read confirm

if [ "${confirm}" != "confirm" ]; then
    echo "Abort."
    exit
fi

# Preliminary checks
echo ""
echo "Preliminary checks..."

stop_if_exists () {
    echo "Making sure $1 does not exist..."
    if [ -f "${pub}/$1" ] || [ -d "${pub}/$1" ]; then
        echo "WARNING: $1 already exists! Check this manually."
        exit
    fi
}
stop_if_exists "content/gwc${year}.json"
stop_if_exists "content/news${year}.json"
stop_if_exists "content/problem-results${year}.json"
stop_if_exists "content/problems${year}.json"
stop_if_exists "content/useroffsets${year}.json"
stop_if_exists "content/users${year}.json"
stop_if_exists "roundup${year}"
stop_if_exists "solutions${year}"
stop_if_exists "test-data${year}"

stop_if_missing () {
    echo "Making sure $1 exists..."
    if [ ! -f "${pub}/$1" ] && [ ! -d "${pub}/$1" ]; then
        echo "WARNING: $1 does not exist! Check this manually."
        exit
    fi
}
stop_if_missing "content/gwc.json"
stop_if_missing "content/news.json"
stop_if_missing "content/problem-results.json"
stop_if_missing "content/problems.json"
stop_if_missing "content/useroffsets.json"
stop_if_missing "content/users.json"
stop_if_missing "solutions"
stop_if_missing "test-data"

# Perform the reset
echo ""
echo "Resetting..."

# Backup all files first
backup () {
    echo "Backing up $1 to $2..."
    cp -r "${pub}/$1" "${pub}/$2" || exit
}
backup "content/gwc.json" "content/gwc${year}.json"
backup "content/news.json" "content/news${year}.json"
backup "content/problem-results.json" "content/problem-results${year}.json"
backup "content/problems.json" "content/problems${year}.json"
backup "content/useroffsets.json" "content/useroffsets${year}.json"
backup "content/users.json" "content/users${year}.json"

# Backup directories
backup "solutions" "solutions${year}"
backup "test-data" "test-data${year}"

# Replace files with new, clean versions
overwrite () {
    echo "Replacing contents of $1 with '$2'..."
    echo "$2" > "${pub}/$1"
}
overwrite "content/gwc.json" "[]"
overwrite "content/news.json" "[]"
overwrite "content/problem-results.json" "{}"
overwrite "content/problems.json" "{}"
overwrite "content/useroffsets.json" "{}"
overwrite "content/users.json" "{}"

# Clear directories
clear_dir () {
    echo "Clearing directory $1..."
    rm -r "${pub}/$1"
    mkdir "${pub}/$1"
}
clear_dir "solutions"
clear_dir "test-data"

# Setup roundup folder
echo "Setting up roundup${next_year} directory..."
cp -r "${pub}/rounduptemplate" "${pub}/roundup${next_year}"

# Inform user of successful reset
echo ""
echo "Reset successful!"
echo "Some manual steps are required (ex: updating officer about page). See the website procedure document in Google Drive for more info."