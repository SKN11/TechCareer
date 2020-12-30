#
# Example file for working with loops
#

def main():
  x = 0

  print("while loop demo")
  # define a while loop
  while(x<5):
    print(x)
    x=x+1

  print("for loop demo")
  # define a for loop
  for i in range(5,10):
    print(i)


  print("for loop demo over a collection")
  # use a for loop over a collection
  days=["mon","tue","wed","thu"]
  for d in days:
    if(d=="wed"):
       #break
       continue
    print(d)
  
  # use the break and continue statements


  #using the enumerate() function to get index 

  for i,d in enumerate(days):
    print(i," ",d)
    #print(d)
  
if __name__ == "__main__":
  main()
