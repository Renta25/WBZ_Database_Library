package table

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object UsersPermissions: Table("users_permissions") {
    val userId: Column<Int> = integer("user").references(Users.id)
    val perm: Column<String> = varchar("perm", 50)
}