class LinkedList:
    
    def __init__(self):
        self.head = None
    
    def insert(self, node):
        cursor = self.head
        if self.head is None:
            self.head = node
        else:
            while cursor.next is not None:
                cursor = cursor.next
            cursor.next = node
    
    def printIt(self):
        print "PRINTING"
        cursor = self.head
        while cursor is not None:
            print "Node: %d" % cursor.getValue()
            cursor = cursor.next
            
        return