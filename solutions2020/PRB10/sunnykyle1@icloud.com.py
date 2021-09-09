'''
PRB10: Deforestation
So, last time I tried this problem, I raged and deleted the file
containing all my code. Very smart of me.
I think it's time to try this again. This time I'll do things
a bit differently. I'll be a bit more clean with my code so that
I don't get completely frustrated like last time.
Alright, let's do this! No time limit this time because this one
is actually hard (even harder than PRA10 imo!).
'''


def distance_from_range(range_1, range_2, number):
    low_range = min([range_1, range_2])
    high_range = max([range_1, range_2])
    if number >= low_range and number <= high_range:
        return 0
    elif number < low_range:
        return low_range - number
    else:
        return number - high_range


def box_method(plot1_x, plot1_y, plot2_x, plot2_y, plot3_x, plot3_y):
    '''
    Box method.
    Draw a 'box' around plot 1 and plot 2. Then, find the distance
    from plot 3 to the box. Add that distance to the distance between
    plot 1 and plot 2 to get the final number of plots to cut down.
    This should work no matter where the plots actually are
    (based on my thinking of this problem).
    '''
    plot3_x_dist = distance_from_range(plot1_x, plot2_x, plot3_x)
    plot3_y_dist = distance_from_range(plot1_y, plot2_y, plot3_y)
    plot3_total_dist = plot3_x_dist + plot3_y_dist
    plot_1_2_dist = abs(plot1_x - plot2_x) + abs(plot1_y - plot2_y) + 1
    return plot3_total_dist + plot_1_2_dist


# Input parsing
for _ in range(int(input())):
    plot1_x, plot1_y = map(int, input().split())
    plot2_x, plot2_y = map(int, input().split())
    plot3_x, plot3_y = map(int, input().split())
    answer = box_method(plot1_x, plot1_y, plot2_x, plot2_y, plot3_x, plot3_y)
    print(answer, flush=True)
