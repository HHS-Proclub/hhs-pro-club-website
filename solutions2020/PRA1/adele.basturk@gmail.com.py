#
# Challenge #2
#

class Phone:
	def __init__(self, discharge_rate, charge):
		self.discharge_rate = discharge_rate
		self.charge = charge

def print_phones(list):
	for i in range(len(list)):
		print('({:.6f}, {:.1f}, {:.6f})'.format(list[i].charge, list[i].discharge_rate, list[i].charge/list[i].discharge_rate), end=' ')
	print(end='\n')
	
def phone_power_count(charge_rate, phones):
	if len(phones) == 1:
		return phones[0].charge/(phones[0].discharge_rate-c)

	t = 0.0
	while(True):
		# Sort by ascending discharge time
		phones = sorted(phones, key=lambda phone: phone.charge/phone.discharge_rate)
		#print_phones(phones)

		# Check if phone is empty.  
		#if phones[0].charge <= 0:
		#	print(t)
			# Already discharged. Negative charge. Adjust time to when the charge reached 0.
		#	t += phones[0].charge/phones[0].discharge_rate
		#	return t

		# Calculate time to charge first phone until it matches second phone discharge time
		charge_time = phones[0].discharge_rate/charge_rate * (phones[1].charge/phones[1].discharge_rate - phones[0].charge/phones[0].discharge_rate)
		#print(charge_time)
		charge_time = max(charge_time, 1/5500)
		#charge_time = 0
		#charge_time = 1/18		
		#print(charge_time)
		
		# Recharge first phone
		#phones[0].charge += charge_time * charge_rate
		
        # This loop will update power for each phone
		adjust_time = 0.0
		can_exit = False
		for i in range(len(phones)):
			effective_rate = -phones[i].discharge_rate
			if (i == 0):
				effective_rate += charge_rate
			
			phones[i].charge += effective_rate * charge_time
			
			if phones[i].charge <= 0:
				can_exit = True
				if effective_rate > 0:
					raise ValueError('rate should be negative')
				adjust_time = max(adjust_time, phones[i].charge/effective_rate)
				#print(i, phones[i].charge, effective_rate)
				#print('adj {:.3f}'.format(adjust_time))
		
		if can_exit:
			#print_phones(phones)
			return t + charge_time - adjust_time
			
		t += charge_time
		
		
num_test_cases = int(input())

for j in range(num_test_cases):
	current_line = input()
	fields = current_line.split()
	n = int(fields[0])
	c = int(fields[1])
	a = []
	b = []
	phones = []
	for i in range(n):
		current_line = input()
		phone_params = current_line.split()
		discharge_rate = float(phone_params[0])
		charge = float(phone_params[1])
		phones.append(Phone(discharge_rate, charge))
	t = phone_power_count(c, phones)
	#print('{:.6f}'.format(t))
	print(t)
	

