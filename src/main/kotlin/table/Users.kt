package table

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object Users: Table("users") {
    val id: Column<Int> = integer("id").primaryKey().autoIncrement()
    val username: Column<String> = varchar("username",20)
    val password: Column<String> = text("password")
    val email: Column<String> = varchar("email", 60)
    val phone: Column<String?> = varchar("phone", 16).nullable()
    val forename: Column<String?> = varchar("forname", 30).nullable()
    val lastname: Column<String?> = varchar("lastname", 30).nullable()
    val blocked: Column<Boolean> = bool("blocked").default(false)
    val archival: Column<Boolean> = bool("archival").default(false)
}