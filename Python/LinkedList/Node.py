class Node():
    def __init__(self, value):
        self.value = value
        self.next = None
        
    def getValue(self):
        return self.value
        
    def getNext(self):
        return self.next