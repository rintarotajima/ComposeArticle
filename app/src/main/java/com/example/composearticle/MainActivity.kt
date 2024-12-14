package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        ArticleImage()
                        ArticleText(
                            text1 = stringResource(R.string.jetpack_compose_tutorial_text1),
                            text2 = stringResource(R.string.jetpack_compose_tutorial_text2),
                            text3 = stringResource(R.string.jetpack_compose_tutorial_text3)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun ArticleImage() {
    val image = painterResource(R.drawable.bg_compose_background)
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.FillWidth
    )
}

@Composable
fun ArticleText(text1: String, text2: String, text3: String) {
    Text(
        text = text1,
        fontSize = 24.sp,
        modifier = Modifier
            .padding(16.dp)

    )
    Text(
        text = text2,
        modifier = Modifier
            .padding(
                start = 16.dp,
                end = 16.dp
            ),
        textAlign = TextAlign.Justify
    )
    Text(
        text = text3,
        modifier = Modifier
            .padding(16.dp),
        textAlign = TextAlign.Justify
    )
}

@Preview(showBackground = true)
@Composable
fun ArticleImagePreview() {
    ComposeArticleTheme {
        Column {
            ArticleImage()
            ArticleText(
                text1 = stringResource(R.string.jetpack_compose_tutorial_text1),
                text2 = stringResource(R.string.jetpack_compose_tutorial_text2),
                text3 = stringResource(R.string.jetpack_compose_tutorial_text3)
            )
        }
    }
}


