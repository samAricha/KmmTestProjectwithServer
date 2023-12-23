package presentation

import SpaceXSDK
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import comtekakmmsharedcache.Launch
import entity.RocketLaunch
import cache.DatabaseDriverFactory


@Composable
fun SpaceXLaunchesHomeScreen() {

    private val sdk = SpaceXSDK(DatabaseDriverFactory(this))


    val launches = remember { sdk.getLaunches(false) }
    val listState = rememberLazyListState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "SpaceX Launches") },
                modifier = Modifier.fillMaxWidth()
            )
        },
        content = {
            LaunchesList(launches, listState)
        },
        modifier = Modifier.fillMaxSize()
    )



}

@Composable
fun LaunchesList(launches: List<RocketLaunch>, listState: LazyListState) {

    LazyColumn(
        state = listState,
        contentPadding = PaddingValues(8.dp),
        modifier = Modifier.fillMaxSize()
    ) {
        items(launches) { launch ->
            LaunchItem(launch)
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

@Composable
fun LaunchItem(launch: Launch) {
    // Implement the UI for a single launch item here
    // You can use Card, Column, Row, etc., based on your design
    // Example: Card with some text elements for launch details
}