#include <iostream>
#include <string>
#include <vector>

int main()
{
	int numTrials = 0;
	std::cin >> numTrials;
	std::cin.ignore();
	
	std::vector<std::pair<int, int>> numsToAdd;
	for (int i = 0; i < numTrials; i++)
	{
		std::string input;
		std::getline(std::cin, input);

		int numOne = std::stoi(input.substr(0, input.find_first_of(' ')));
		int numTwo = std::stoi(input.substr(input.find_first_of(' ') + 1));

		numsToAdd.push_back(std::make_pair(numOne, numTwo));
	}

	for (std::pair<int, int> nums : numsToAdd)
	{
		std::cout << nums.first + nums.second << std::endl;
	}

	return 0;
}