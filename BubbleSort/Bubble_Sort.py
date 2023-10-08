def BubbleSort(arr):
    flag = False
    for i in range(len(arr)):
        for j in range(1,len(arr)-i):
            if(arr[j] < arr[j-1]):
                temp = arr[j]
                arr[j] = arr[j-1]
                arr[j-1] = temp
                flag = True
        if(flag==False):
            break

print("enter the values for the array seperated with commas")
arr=[int(s) for s in input().split(",")]
BubbleSort(arr)

print("Sorted array : ")
print(arr)