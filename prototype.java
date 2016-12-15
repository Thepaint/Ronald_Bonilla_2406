worker_registration
+makeAccount: String
+workerAccount: String
+workerID: int

User_account
+makeAccount: String
+userAccount: String
+userID: int

Orders
+makeOrder: String
+userAccount: String
+Description: String
+workerID:int

Bill
+userID: String
+userAccount: String
+workerID: int
+commission: int

Contracted Worker
+userAccount: String
+workerAccount: String
+workerID: int
