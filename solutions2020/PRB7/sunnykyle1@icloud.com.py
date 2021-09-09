"""
PRB7.

This time it's a speed run. LETSAGO
Result: Went pretty smoothly once I actually thought the problem out.
Didn't exactly do it within a speed run worthy time though.
I've learned (again) that thinking things out helps. A lot. Really. Do it.
"""

# Save already found number factors in here so they don't have to be
# calculated again
number_factors = {}


def fix_float(number):
    """Fixes floats by limiting the amount of decimal digits."""
    return int(round(number, 8))


def prime_factorization(number):
    """Returns a number's prime factors (in list data type)."""
    prime_factors = []
    # Check if it's been calculated already; if yes, don't do it
    # again; just return the already known value
    starting_number = number
    global number_factors
    if number in number_factors:
        prime_factors = number_factors[number]
    else:
        found_factor = True
        while found_factor:
            found_factor = False
            # Look for possible factors
            for possible_factor in range(2, int(number ** 0.5) + 2):
                if number % possible_factor == 0 and number != possible_factor:
                    # Update the new number
                    number = fix_float(number / possible_factor)
                    # Use recursion to find all the prime factors
                    prime_factors += prime_factorization(possible_factor)
                    found_factor = True
                    break
        # No more factors; return current prime factors
        # (add the number itself too)
        prime_factors.append(number)
        # Update the known list of prime factors
        number_factors[starting_number] = prime_factors
    return prime_factors


def list_to_dict(prime_list):
    """
    Returns a dictionary of prime factors when given a list of them.

    Key is the prime factor, value is the number of times that prime
    factor appears.
    """
    prime_dict = {}
    for prime in prime_list:
        if prime not in prime_dict:
            prime_dict[prime] = 0
        prime_dict[prime] += 1
    return prime_dict


def prime_factors_dict(number):
    """
    Simple function that combines the prime_factorization() and
    list_to_dict() functions to return a dictionary with prime factors.
    """
    return list_to_dict(prime_factorization(number))


def attempt2(score_1, score_2):
    """
    Second attempt.

    Plan: Find the prime factorization of both scores. Then, check
    if each prime factor, when added together, is divisible by 3,
    since k and k^2 means 3 factors for a possible score. If every
    prime factor is divisble by 3, the scores are possible.
    Requires a prime factorization recursive function.
    """
    scores_possible = True
    primes_1 = prime_factors_dict(score_1)
    primes_2 = prime_factors_dict(score_2)
    for prime_factor, count_1 in primes_1.items():
        count_2 = primes_2.get(prime_factor)
        if count_2 is None:
            # 2nd score doesn't have a prime factor that the
            # 1st score has, which is impossible in this game
            scores_possible = False
            break
        else:
            # Check if the added prime factors is divisible by 3
            # If not, the scores are impossible
            if (count_1 + count_2) % 3 != 0:
                scores_possible = False
                break
    # Special case: If both scores are 1, the scores are possible
    if score_1 == 1 and score_2 == 1:
        scores_possible = True
    return scores_possible


def attempt1(score_1, score_2):
    """
    First attempt.

    Plan: Find factors of 1 of the scores, divide both
    scores by the found factor. Keep track of found
    factors. Test if the final scores match the found
    factors.
    Result: I think I rushed too much. I have no clue what
    this code even does, so I'm going to try and think the
    problem through again before starting a fresh attempt.
    """
    factors = []
    is_possible = True
    new_score_1 = score_1
    new_score_2 = score_2
    # Find all factors of score_1
    while is_possible and new_score_1 != 1:
        factor_found = False
        for factor in range(2, new_score_1 + 1):
            if new_score_1 % factor ** 2 == 0 and new_score_2 % factor == 0:
                # score_1 was multiplied by the
                # squared version, while score_2 wasn't:
                # This is ok
                new_score_1 = int(new_score_1 / (factor ** 2))
                new_score_2 = int(new_score_2 / factor)
                factor_found = True
                factors.append(factor ** 2)
                break
            elif new_score_1 % factor == 0 and new_score_2 % factor ** 2 == 0:
                # score_2 was multiplied by the
                # squared version, while score_1 wasn't:
                # This is ok
                new_score_1 = int(new_score_1 / factor)
                new_score_2 = int(new_score_2 / (factor ** 2))
                factor_found = True
                factors.append(factor)
                break
        if not factor_found:
            is_possible = False
            print("No factor found.")
        print(new_score_1, new_score_2)

    if new_score_2 != 1:
        is_possible = False
    return is_possible


if __name__ == "__main__":
    # Input parsing
    for game in range(0, int(input())):
        luke_score, morgan_score = map(int, input().split())
        game_possible = attempt2(luke_score, morgan_score)
        if game_possible:
            print("Yes", flush=True)
        else:
            print("No", flush=True)
