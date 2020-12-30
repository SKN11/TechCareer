# 
# Example file for variables
#

# Declare a variable and initialize it
f=0
print(f)


# re-declaring the variable works

f=1
print(f)

# ERROR: variables of different types cannot be combined
print(str(f)+"hello")


# Global vs. local variables in functions
def simple():
    global f
    f=40
    print(f)

simple()
print(f) 

del(f)
print(f)