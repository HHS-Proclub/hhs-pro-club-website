def connected_points(num_drifts, x): 
    x_repeats = []
    y_repeats = []
    count = []
    for i in range(0, len(x)): 
        for j in range(i + 1, len(x)): 
            if x[i][0] == x[j][0]: 
              if i not in x_repeats:
                x_repeats.append(i) 
              if j not in x_repeats:
                x_repeats.append(j)
                
            if x[i][1] == x[j][1]: 
              if i not in x_repeats:
                y_repeats.append(i) 
              if j not in x_repeats:
                y_repeats.append(j)
                
    x_repeated_values = []
    y_repeated_values = []
    
    for i in range(0, len(x)): 
        for j in range(i + 1, len(x)): 
            if x[i][0] == x[j][0] and x[i][0] not in x_repeated_values: 
                x_repeated_values.append(x[i][0]) 
            if x[i][1] == x[j][1] and x[i][1] not in y_repeated_values: 
                y_repeated_values.append(x[i][1]) 
                
    return num_drifts - (len(x_repeats) + len(y_repeats) - len(x_repeated_values) - len(y_repeated_values))


def snow_drifts(num_drifts):
  
  drift_locations = []
  
  for i in range(num_drifts):
    temporary_drift = input().split()
    temporary_drift[0] = int(temporary_drift[0])
    temporary_drift[1] = int(temporary_drift[1])
    drift_locations.append(temporary_drift)
    temporary_drift = []
    
  print(connected_points(num_drifts, drift_locations) - 1)

num_test_cases = int(input())

for i in range(num_test_cases):
  num_drifts = int(input())
  snow_drifts(num_drifts)