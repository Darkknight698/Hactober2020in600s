'''
Defining a function to check if a string is Palindrome or not.
We'll reverse a string and check if the original string and reversed string are equivalent.
Then we'll return True or False accordingly.
'''


def isPalindrome(x):
    if x == x[::-1] :
        return False
    else :
        return True