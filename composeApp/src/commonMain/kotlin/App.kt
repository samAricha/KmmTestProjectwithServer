
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import kotlinx.datetime.TimeZone
import models.Country
import presentation.WorldCitiesTimesPage

@Composable
fun App(countries: List<Country> = countries()) {
    MaterialTheme {
        WorldCitiesTimesPage(countries)
    }
}



fun countries() = listOf(
    Country("Kenya", TimeZone.of("Africa/Nairobi"), "ke.png"),
    Country("Japan", TimeZone.of("Asia/Tokyo"), "jp.png"),
    Country("France", TimeZone.of("Europe/Paris"), "fr.png"),
    Country("Mexico", TimeZone.of("America/Mexico_City"), "mx.png"),
    Country("Indonesia", TimeZone.of("Asia/Jakarta"), "id.png"),
    Country("Egypt", TimeZone.of("Africa/Cairo"), "eg.png")
)


