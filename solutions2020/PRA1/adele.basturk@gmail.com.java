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
	total_charge = 0.0
	total_discharge_rate = 0.0
	
	phones = sorted(phones, key=lambda phone: phone.charge/phone.discharge_rate)

	for i in range(len(phones)):
		total_charge += phones[i].charge
		total_discharge_rate += phones[i].discharge_rate

		if total_discharge_rate > c:
			total_deadline = total_charge/(total_discharge_rate - charge_rate)
			if i + 1 < len(phones):
				if total_deadline <= phones[i+1].charge/phones[i+1].discharge_rate:
					# The phone i+1 will never be charged. Can return here.
					return total_deadline
			else:
				return total_deadline
	
	# Should only reach here is total discharge rate is less than charge rate
	# or the phone list is empty
	return 0.0
	
		
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
	print('{:.6f}'.format(t))
	#print(t)
	

