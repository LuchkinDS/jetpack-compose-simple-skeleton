package ru.luchkinds.jetpack_compose_simple_skeleton.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import dagger.hilt.EntryPoint
import ru.luchkinds.jetpack_compose_simple_skeleton.navigation.SampleNavigation
import ru.luchkinds.jetpack_compose_simple_skeleton.ui.theme.JetpackComposeSimpleSkeletonTheme

@EntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeSimpleSkeletonTheme {
                val navController = rememberNavController()
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SampleNavigation(
                        modifier = Modifier.padding(innerPadding),
                        navController = navController,
                        firstScreenContent = {
                            Greeting()
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            modifier = Modifier
                .align(Alignment.Center),
            text = "First Screen"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeSimpleSkeletonTheme {
        Greeting()
    }
}