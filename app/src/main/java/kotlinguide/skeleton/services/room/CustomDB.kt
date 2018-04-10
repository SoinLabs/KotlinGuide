package kotlinguide.skeleton.services.room

/** -*- coding: utf-8 -*-
 * This file was created by
 * @Author: aulate
 * @Date:   19/3/18
 */
//@Database(entities = [(Church::class), (Parish::class), (Announcement::class), (Eucharist::class)],
//        version = 1,
//        exportSchema = false)
//@TypeConverters(value = [(DateTimeConverters::class)])
//abstract class MiParroquiaDB : RoomDatabase() {
//    abstract fun parishDao(): CustomDao
//    abstract fun churchDao(): ChurchDao
//    abstract fun eucharistDao(): EucharistDao
//
//    companion object {
//        const val PARISHES_TABLENAME = "parishes"
//        const val CHURCHES_TABLENAME = "churches"
//        const val ANNOUNCEMENTS_TABLENAME = "announcements"
//        const val EUCHARISTS_TABLENAME = "eucharists"
//        const val PRIESTS_TABLENAME = "priests"
//        const val CATALOGUES_TABLENAME = "catalogues"
//    }
//}