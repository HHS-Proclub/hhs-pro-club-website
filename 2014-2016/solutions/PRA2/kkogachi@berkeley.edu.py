"""
Levenshtein Distance:
 Min num of deletions, insertions, and substitutions
 needed to change one string to another.

Creates a table, initialized to zero
  Fill first row with 0, 1, 2, ..., string1.length
  Fill first col with 0, 1, 2, ..., string2.length
    These numbers represent levenshtein dist for 
    first substring to next.

Start at table position [1][1] and follow these steps:
  at position [i][j] (row x column)
    if : s1[i] = s2[j], no change is needed
                        so [i][j] = [i-1][j-1]
  else : [i][j] = min([i-1][j]  +1,  #deleted
                      [i][j-1]  +1,  #inserted
                      [i-1][j-1]+1,  #substituted

Return the last element of the table.

Ex. s1 = "cat"
    s2 = "dots"

 Table: cat -> dots
                Operations
      c a t         c a t
    0 1 2 3       0 D D D
  d 1 1 2 3     d I S D D
  o 2 2 2 3     o I I S D
  t 3 3 3 2     t I I I -
  s 4 4 4 3     s I I I I

 result: 3 (bottom right corner)

"""

s1,s2 = input(),input()

table = [[0 for _ in range(len(s1)+1)] for _ in range(len(s2)+1)]

#first col, row
for x in range(len(s2)+1):
    table[x][0] = x
table[0] = list(range(0,len(s1)+1))

#i and j flipped since col x row
for j in range(1,len(s1)+1):
    for i in range(1,len(s2)+1):
        if s1[j-1] == s2[i-1]:
            table[i][j] = table[i-1][j-1]  #no change needed
        else:
            table[i][j] = min(table[i-1][j]  +1,   #deletion
                              table[i][j-1]  +1,   #insertion
                              table[i-1][j-1]+1)   #substitution

#[print(x) for x in table]
print(table[len(s2)][len(s1)])
