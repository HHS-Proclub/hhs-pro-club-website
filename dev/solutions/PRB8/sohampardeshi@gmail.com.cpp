#include <iostream>
#include <map>
using namespace std;
 
int main ()
{
    int dataset;
    cin >> dataset;
 
    map <string, int> m;
 
    //initialization
    m ["one"] = 1;  m ["two"] = 2;  m ["three"] = 3;
    m ["four"] = 4; m ["five"] = 5; m ["six"] = 6;
    m ["seven"] = 7;m ["eight"] = 8;m ["nine"] = 9;
    m ["ten"] = 10; m ["eleven"] = 11; m ["twelve"] = 12;
    m ["thirteen"] = 13; m ["fourteen"] = 14; m ["fifteen"] = 15;
    m ["sixteen"] = 16; m ["seventeen"] = 17;
    m ["eighteen"] = 18; m ["nineteen"] = 19;
 
    while ( dataset-- ) {
 
        int input;
        map <string, int>::iterator it;
        string str [20];
        int index = 0;
 
        while ( cin >> input && input ) {
            for ( it = m.begin (); it != m.end (); it++ ) {
                if ( (*it).second == input )
                    str [index++] = (*it).first;
            }
        }
 
        // sort sorting
        for ( int i = 0; i < index; i++ ) {
            for ( int j = i + 1; j < index; j++ ) {
                if ( str [i] > str [j] )
                    swap (str [i], str [j]);
            }
        }
 
        cout << m [str [0]];
        for ( int i = 1; i < index; i++ )
            cout << " " << m [str [i]];
 
        cout << endl;
 
    }
 
    return 0;
}