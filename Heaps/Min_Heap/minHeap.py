
def swap(arr,first,second):
    arr[first],arr[second] = arr[second],arr[first]

def parent(index):
    return (index-1)//2

def left(index):
    return 2*index+1

def right(index):
    return 2*index+2

def insert(arr,element):
    arr.append(element)
    upheap(arr,len(arr)-1)

def upheap(arr,index):

    if index==0:
        return

    parent_index = parent(index)

    if arr[parent_index]>arr[index]:
        swap(arr,parent_index,index)

    upheap(arr,parent_index)

def remove(arr):
    if not arr:
        return

    if len(arr)==1:
        arr.pop()
        return

    arr[0] = arr.pop()
    downheap(arr,0)


def downheap(arr,index):

    left_index = left(index)
    right_index = right(index)
    smallest = index

    if left_index < len(arr) and arr[left_index]<arr[smallest]:
        smallest = left_index

    if right_index < len(arr) and arr[right_index]<arr[smallest]:
        smallest = right_index

    if smallest != index:
        swap(arr,index,smallest)
        downheap(arr,smallest)

arr = []
insert(arr, 1)
insert(arr, 2)
insert(arr, 3)
insert(arr, 4)
insert(arr, 5)
insert(arr, 6)
insert(arr, 7)
insert(arr, 8)
insert(arr, 9)
insert(arr, 10)

print("Heap before removal:", arr)
remove(arr)
print("Heap after removal:", arr)





