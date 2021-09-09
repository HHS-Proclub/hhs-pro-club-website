'''
PRB8: Test
By Giantpizzahead

Alright, back to sweet little IDLE. No neat code anymore! YAYYY
This one seems really easy, so let's go. Under 20 minutes ;)

Time limit: 20 minutes (including testing / strategy)
Actual time taken: ?
'''

# No attempts for this one; I'm confident! :)
# Input parsing
for _ in range(int(input())):
    num_questions, num_correct, needed_to_double = map(int, input().split())
    max_wrong = num_questions - num_correct
    questions_left = num_questions

    # Figure out minimum number of doubles
    number_of_doubles = 0
    while max_wrong > 0:
        questions_left -= needed_to_double
        max_wrong -= 1
    while questions_left > needed_to_double - 1:
        questions_left -= needed_to_double
        number_of_doubles += 1
    # print(number_of_doubles)

    # Figure out minimum possible score
    current_score = 0
    correct_answers_left = num_correct
    for double in range(number_of_doubles):
        current_score += needed_to_double
        correct_answers_left -= needed_to_double
        current_score *= 2
    current_score += correct_answers_left
    print(current_score, flush=True)
