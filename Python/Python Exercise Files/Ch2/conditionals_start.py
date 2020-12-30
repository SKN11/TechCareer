#
# Example file for working with conditional statements
#


def main(arg1,arg2):
    #x, y = 10, 100

    x=arg1
    y=arg2

    # conditional flow uses if, elif, else
    if(x<y):
        print("x is less than y")
    elif(x>y):
        print("x is more than y")
    else:
        print("x & y equal")

    # conditional statements let you use "a if C else b"

    result= print("x is less than y") if(x<y) else print("x is more than y or equal")
    print(result)


if __name__ == "__main__":
    main(20,20)
