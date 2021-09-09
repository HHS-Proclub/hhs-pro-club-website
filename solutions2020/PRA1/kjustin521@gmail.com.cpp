#include <string>
#include <iostream>
#include <vector>

int main()
{
	int numTrials;
	std::cin >> numTrials;

	std::vector<int> numsToTest;
	std::vector<int> results;

	for (int i = 0; i < numTrials; i++)
	{
		int input;
		std::cin >> input;

		numsToTest.push_back(input);
	}

	for (int i = 0; i < numTrials; i++)
	{
		int year = numsToTest[i];
		int nextDistinctYear = year + 1;

		bool isDistinctYear = false;
		while (!isDistinctYear)
		{
			std::string yr = std::to_string(nextDistinctYear);
			
			int digitOne = yr[0] - '0';
			int digitTwo = yr[1] - '0';
			int digitThree = yr[2] - '0';
			int digitFour = yr[3] - '0';

			if (!(digitOne == digitTwo || digitOne == digitThree || digitOne == digitFour ||
				digitTwo == digitThree || digitTwo == digitFour || digitThree == digitFour))
			{
				isDistinctYear = true;
				results.push_back(std::stoi(yr));
			}
	
			nextDistinctYear++;
		}
	}

	for (int i = 0; i < results.size(); i++)
	{
		std::cout << results[i] << std::endl;
	}

	return 0;
}