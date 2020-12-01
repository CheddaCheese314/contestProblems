n = int(input());
a1 = False
a2 = False
b1 = False
b2 = False
for i in range(n):
    s = input()
    if(i%2==0):
        if s.find("*winks*")>=0:
            a1 = True
        if s.find("*checks watch")>=0:
            a2 = True
    else:
        if s.find("*winks*")>=0:
            b1 = True
        if s.find("*checks watch")>=0:
            b2 = True
if(a1 and a2):
    print("JINGLE IS A SPY!")
if(b1 and b2):
    print("GUMDROP IS A SPY!")
if(not(a1 and a2) and not(b1 and b2)):
    print("NO SPIES ARE PRESENT")
        
