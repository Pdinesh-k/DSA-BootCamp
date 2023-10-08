def InsertionSort(ls):
    for i in range(0,(len(ls)-1)):
        for j in range(1,(len(ls))):
            while(j > 0 and ls[j-1] > ls[j]):
                swap(ls,j,j-1)
                j-=1

def swap(ls,i,j):
    ls[i],ls[j] = ls[j],ls[i]

ls=[5,7,3,9,1,6,8,4,2]
InsertionSort(ls)

print(ls)