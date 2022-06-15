package com.example.composedesigncodelabs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.example.composedesigncodelabs.ui.composable.ComplexPersonalizedDesignCodeLabs
import com.example.composedesigncodelabs.ui.theme.ComposeDesignCodeLabsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDesignCodeLabsTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
//                    PhotographerCard()
//                    LayoutsCodeLabs()
//                    ScrollingList()
//                    PersonalizedDesignCodeLabs()
                    ComplexPersonalizedDesignCodeLabs()
                }
            }
        }
    }
}
