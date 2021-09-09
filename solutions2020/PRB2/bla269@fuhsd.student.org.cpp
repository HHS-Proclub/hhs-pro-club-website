#include <iostream>
using namespace std;
int A[15][15];
int main(){
	int n,row, column, totalStudents,minStudents,currentStudents,xPos, yPos,numPictures; 
	cin >> n;
	for (int i = 0; i < n; i++){
		numPictures = 0;
		cin >> row >> column >> totalStudents >> minStudents;
		for(int j = 0;j < 15;j++) {
			for (int k = 0; k < 15; k++){
				A[j][k] = 0;
			}
		}
		
		for (int j = 0; j < totalStudents; j++){
			cin >> xPos >> yPos;
			A[xPos][yPos] = 1;
		}
		
		for ( xPos = 1; xPos <= row; xPos++){
			for ( yPos = 1; yPos <= column; yPos++){
				for (int height = 1; height <= row - xPos+1;height++){
					for (int width = 1; width <= column - yPos+1; width++){
					currentStudents = 0;
						for (int j = xPos; j < xPos + height; j++){
							for (int k = yPos; k <yPos + width; k++){
								if (A[j][k] == 1){
									currentStudents++;
								}
							}
						}
						if (currentStudents >= minStudents){
							numPictures++;
						}
					}	
				}
			}
		}
		cout << numPictures<<endl;
	}
}
