package com.example.artspaceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.artspaceapp.ui.theme.ArtSpaceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpaceAppLayout()
                }
            }
        }
    }

    @Composable
    fun ArtSpaceAppLayout() {

        var currentImage by remember { mutableStateOf(1) }

        Column(
            modifier = Modifier
                .statusBarsPadding()
                .padding(20.dp)
                .verticalScroll(rememberScrollState())
                .safeDrawingPadding(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

        }
    }

    @Composable
    fun ImageCadre(
        drawableResourceId: Int,
        contentDescriptionResourceId: Int) {
        Image(
            painter = painterResource(drawableResourceId),
            contentDescription = stringResource(contentDescriptionResourceId))
    }

    @Composable
    fun DescriptionPane() {
        Column {
            Text(text = "Name")
            Text(text = "Owner")
        }
    }

    @Composable
    fun ButtonsPane(currentImage: Int): Int {
        var newValueCurrentImage: Int = currentImage
        Row {
            Button(onClick = {

            }) {
                Text(text = "Previous")
            }
            Button(onClick = {

            }) {
                Text(text = "Next")
            }
        }
        return newValueCurrentImage
    }

    @Preview
    @Composable
    fun ArtSpaceAppPreview() {
        ArtSpaceAppTheme {
            ArtSpaceAppLayout()
        }
    }
}

