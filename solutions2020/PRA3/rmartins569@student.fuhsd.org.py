def max_pleasure(s):
  
  n = int(s[0])
  k = int(s[1])
  playlist = []
  song = []
  
  for i in range(0, n):
    song_info = input().split()
    song.append(int(song_info[1]))
    song.append(int(song_info[0]))
    playlist.append(song)
    song = []
    
  playlist.sort(key = lambda a: a[0], reverse = True)
  pleasure = []
  time = []
  time_sum = 0
  
  #start at high beauty and go to lower and lower beauty until you cannot go any further
  
  for i in range(0, n):
    time_sum += playlist[i][1]
    time.append(playlist[i][1])
    if k < len(time): #add to time as long as possible but cannot let it exceed max
      time.sort(reverse = True)
      time_sum -= time.pop()
    pleasure.append(time_sum * playlist[i][0])
  
  pleasure.sort(reverse = True)
  print(pleasure[0])

    
  '''for i in range(0, n):
    if i < k:
      for x in range(0, i):
        time_sum += playlist_beauty[x][0]
      pleasure.append(time_sum * playlist_beauty[i-1][1])
      time_sum = 0
    if i >= k:
      for x in range(0, i):
        playlist_time.append(playlist_beauty[x][0])
      playlist_time.sort(reverse = True)
      for a in range(0, k):
        time_sum += playlist_time[a]
      pleasure.append(time_sum * playlist_beauty[i-1][1])
      time_sum = 0
      playlist_time = []
      
  print(pleasure)'''

num_test_cases = int(input())

for i in range(num_test_cases):
  s = input().split()
  max_pleasure(s)
