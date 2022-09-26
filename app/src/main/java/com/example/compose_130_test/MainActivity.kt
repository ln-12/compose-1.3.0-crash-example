package com.example.compose_130_test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.produceState
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.window.DialogProperties
import com.example.compose_130_test.ui.theme.Compose_130_testTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalComposeUiApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_130_testTheme {
                val something by produceState(initialValue = false) {
                    value = true
                }

                if (!something) {
                    AlertDialog(
                        onDismissRequest = {},
                        title = { Text("Title") },
                        text = { Text("Text") },
                        confirmButton = {
                            TextButton(onClick = {

                            }) {
                                Text("Close")
                            }
                        },
                        properties = DialogProperties(usePlatformDefaultWidth = true),
                    )
                }
            }
        }
    }
}
