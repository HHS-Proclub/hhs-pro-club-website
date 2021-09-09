(w,h) = raw_input("").split(" ")
w = int(w)
h = int(h)
farm = ""
for i in range(h):
	farm += raw_input()+"\n"
lines = farm.split("\n")
bools = []
tvert = 0
thori = 0
points = []
collection = []
def booleanize(arr):
	bools.append([True if o == "#" else False for o in arr])
map(booleanize, lines)
def get(ix,iy):
	if ix<0 or iy<0 or ix>=w or iy>=h:
		return False
	return bools[iy][ix]
def s_et(ix,iy,boolean):
	if ix<0 or iy<0 or ix>=w or iy>=h:
		return False
	bools[iy][ix] = boolean
def line(ix,iy,dx,dy):
	quit = False
	counter = 0
	while not quit:
		ix = ix+dx
		iy = iy+dy
		if not get(ix,iy):
			quit = True
		counter += 1
	if counter <= 1:
		return False
	return [ix-dx,iy-dy]
def handle(ix,iy,vo,ho):
	global tvert,thori
	down = up = right = left = False
	if vo:
		down = line(ix,iy,0,1)
		up = line(ix,iy,0,-1)
	if ho:
		right = line(ix,iy,1,0)
		left = line(ix,iy,-1,0)
	if left and right:
		left = False
		right = False
	if up and down:
		up = False
		down = False
	svo = False
	sho = False
	o = None
	if not(down == False and up == False):
		tvert += 1
		sho = True
		if down:
			o = down
		else:
			o = up
	elif not(left == False and right == False):
		thori += 1
		svo = True
		if left:
			o = left
		else:
			o = right
	if o == None:
		return
	points.append(o)
	if thori >= 2 and tvert >= 2:
		return True
	handle(o[0],o[1],svo,sho)
counter = 0
for iy, y in enumerate(bools):
	for ix, x in enumerate(y):
		if get(ix,iy):
			down1 = line(ix,iy,0,1)
			down2 = line(ix+2,iy,0,1)
			if down1 and down2:
				if down1[1] == down2[1] and not get(ix+1,iy) and not get(ix+1,down1[1]):
					for i in range(iy+1,down1[1]):
						s_et(ix,i,False)
						s_et(ix+2,i,False)
					s_et(ix+1,iy,True)
					s_et(ix+1,down1[1],True)
			right1 = line(ix,iy,1,0)
			right2 = line(ix,iy+2,1,0)
			if right1 and right2:
				if right1[0] == right2[0] and not get(ix,iy+1) and not get(right1[0],iy+1):
					for i in range(ix+1,right1[0]):
						s_et(i,iy,False)
						s_et(i,iy+2,False)
for iy, y in enumerate(bools):
	ln = ""
	for ix, x in enumerate(y):
		if get(ix,iy):
			ln += "#"
		else:
			ln += "."
	print ln
for iy, y in enumerate(bools):
	for ix, x in enumerate(y):
		if get(ix,iy):
			tvert = 0
			thori = 0
			handle(ix,iy,True,True)
			if tvert >= 2 and thori >= 2:
				counter += 1
				collection.append(points)
			points = []
to_remove = []
for index1,s1 in enumerate(collection):
	for index2,s2 in enumerate(collection):
		if index1 == index2:
			break
		ct = 0
		for i in range(4):
			for j in range(4):
				if s1[i] == s2[j]:
					ct += 1
		if ct == 4:
			to_remove.append(index2)
counter = 0
to_remove = list(set(to_remove))
for index in to_remove:
	collection.pop(index-counter)
	counter += 1
print len(collection)