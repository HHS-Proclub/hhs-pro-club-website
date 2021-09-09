#include <cstdio>
#include <utility>
#include <cmath>
#include <algorithm>
#include <iostream>

using namespace std;

int cases;
int width;
int height;
int numStudents;
int wantedStudents;
int tempX;
int tempY;

int main() {
    scanf(" %d", &cases);
    
    for (int i=0; i<cases; i++) {
        
        scanf(" %d", &width);
        scanf(" %d", &height);
        scanf(" %d", &numStudents);
        scanf(" %d", &wantedStudents);
        
        
        int xPos[150] = {10000};
        int yPos[150] = {10000};
        
        for (int i=0; i<numStudents; i++) {
            scanf(" %d", &tempX);
            scanf(" %d", &tempY);
            
            xPos[i] = tempX;
            yPos[i] = tempY;
            
        }
        
        int answers[1000000] = {0};
        int startX[100000] = {0};
        int endX[100000] = {0};
        int startY[100000] = {0};
        int endY[100000] = {0};
        int finalAnswer = 0;
        int counter = 0;
        
        for (int x=1; x<width+1; x++) {
            int xBound = x;
            
            while (xBound <= width) {
                
                
                for (int y=1; y<height+1; y++) {
                    int yBound = y;
                    
                    while (yBound <= height) {
                        
                        for(int z = 0; z<numStudents; z++) {
                            if(xPos[z] >= x && xPos[z] <= xBound && yPos[z] >= y && yPos[z] <= yBound) {
                                answers[counter]++;
                            }
                        }
                        
                        startX[counter] = x;
                        endX[counter] = xBound;
                        startY[counter] = y;
                        endY[counter] = yBound;
                        
                        yBound++;
                        counter++;
                    }
                }
                
                xBound++;
            }
            
            
        }
        
        
        for (int a = 0; a < (((width)*(width+1)/2)*((height)*(height+1)/2)); a++) {
            //cout << "x : " << startX[a] << "-" << endX[a] << "; y: " << startY[a] << "-" << endY[a] << " -> " <<answers[a] << endl;
            if (answers[a] >= wantedStudents) {
                
                finalAnswer++;
            }
        }
        
        printf("%d\n", finalAnswer);
    }
    
    return 0;
}