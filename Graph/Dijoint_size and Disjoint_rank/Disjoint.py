class Disjoint:
    def ultimate_parent(self,node,parent):
        if node == parent[node]:
            return node
        parent[node] = self.ultimate_parent(parent[node],parent)
        return parent[node]

    def disjoint_size(self,n,arr,parent,size):
        for i in range(len(arr)):
            x,y = arr[i]
            parent_x = self.ultimate_parent(x,parent)
            parent_y = self.ultimate_parent(y,parent)

            if parent_x == parent_y:
                continue
            if size[parent_x]<size[parent_y]:
                size[parent_y]+=size[parent_x]
                parent[parent_x] = parent_y
            else:
                size[parent_x]+=size[parent_y]
                parent[parent_y] = parent_x

        return parent

    def disjoint_func(self,n,arr,parent,rank):

        for i in range(len(arr)):
            x,y = arr[i]
            parent_x = self.ultimate_parent(x,parent)
            parent_y = self.ultimate_parent(y,parent)

            if parent_x == parent_y:
                continue

            if rank[parent_x]<rank[parent_y]:
                parent[parent_x] = parent_y
            elif rank[parent_y]<rank[parent_x]:
                parent[parent_y] = parent_x
            else:
                parent[parent_y] = parent_x
                rank[parent_x]+=1

        return parent

    def is_connected(self,x,y,parent):
        return self.ultimate_parent(x,parent) == self.ultimate_parent(y,parent)


sol = Disjoint()
n = 5
arr = [[0,1],[1,2],[4,5],[1,3]]

parent_rank = [i for i in range(n + 1)]
rank = [0] * (n + 1)
result_rank = sol.disjoint_func(n, arr, parent_rank, rank)


parent_size = [i for i in range(n + 1)]
size = [1] * (n + 1)
result_size = sol.disjoint_size(n, arr, parent_size, size)


print("Parent (Rank-based):", result_rank)
print("Parent (Size-based):", result_size)
print("Is 1 connected to 2 (Rank-based)?", sol.is_connected(1, 2, result_rank))
print("Is 2 connected to 5 (Size-based)?", sol.is_connected(2, 5, result_size))