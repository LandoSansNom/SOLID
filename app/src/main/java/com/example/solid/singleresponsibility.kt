package com.example.solid

// Bad Approach
class User(
    val id: Int,
    val name: String,
    val email: String,
    val phoneNumber: String
)
class AdminDashboardService {
    fun sendNotification(user: User) {
        println("Preparing email content")
        println("Sending email to ${user.email}")
    }
    fun deleteUser(user: User) {
        println("Deleting user with id ${user.id} from the database")
    }
}


// Good Approach
class UserAccountService {
    fun deleteUser(user: User) {
        println("Deleting user with id ${user.id} from the database")
    }
}
class EmailContentProvider {
    fun prepareContent() {
        println("Preparing email content")
    }
}
class EmailNotificationService {
    fun sendNotification(user: User) {
        println("Sending email to ${user.email}")
    }
}