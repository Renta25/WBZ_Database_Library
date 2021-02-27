package table

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table
import java.sql.Blob

object Articles: Table("articles") {
    val id: Column<Int> = integer("id").primaryKey().autoIncrement()
    val codename: Column<String?> = varchar("codename",20).nullable()
    val name: Column<String> = varchar("name", 100)
    val ean: Column<String?> = varchar("ean", 20).nullable()
    val price: Column<Float?> = float("price").nullable()
    val archival: Column<Boolean> = bool("archival")
    val comment: Column<String?> = text("comment").nullable()
    val icon: Column<Blob?> = blob("icon").nullable()
}