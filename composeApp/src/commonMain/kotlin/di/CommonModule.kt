package di

import com.teka.kmm.shared.cache.AppDatabase
import org.koin.dsl.module
import cache.DatabaseDriverFactory


fun commonModule() = module {
    /**
     * Database
     */
    single<AppDatabase> {
        AppDatabase(
            driver = get<DatabaseDriverFactory>().createDriver()
        )
    }
}
