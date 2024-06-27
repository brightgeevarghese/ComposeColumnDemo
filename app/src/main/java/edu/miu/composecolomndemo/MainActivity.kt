package edu.miu.composecolomndemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.miu.composecolomndemo.ui.theme.ComposeColomnDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeColomnDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Top
                    ) {
                        MyImage(
                            imageId = R.drawable.miu_logo,
                            imageDescription = "Miu Logo",
                            modifier = Modifier
                                .padding(innerPadding)
                        )
                        MyText(
                            text = "Maharishi International University",
                            modifier = Modifier
                                .padding(10.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun MyImage(imageId: Int, imageDescription: String, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = imageId),
        contentDescription = imageDescription,
        modifier = modifier
    )
}

@Composable
fun MyText(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier
    )
}

@Composable
@Preview(showBackground = true)
fun DefaultPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
//        verticalArrangement = Arrangement.Bottom,
//        verticalArrangement = Arrangement.Center,
//        verticalArrangement = Arrangement.SpaceEvenly,
//        verticalArrangement = Arrangement.SpaceBetween,
//        verticalArrangement = Arrangement.SpaceAround
        horizontalAlignment = Alignment.CenterHorizontally
//        horizontalAlignment = Alignment.Start
//        horizontalAlignment = Alignment.End
    ) {
        MyImage(
            imageId = R.drawable.miu_logo,
            imageDescription = "Miu Logo",
            modifier = Modifier
                .padding(top = 20.dp, bottom = 20.dp)
        )
        MyText(
            text = "Maharishi International University",
            modifier = Modifier
        )
    }
}