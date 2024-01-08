package com.example.mymathgameproject

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextForQuestion(
    text: String
) {
    Text(
        text = text,
        fontSize = 24.sp,
        color = Color.White,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .background(
                color = colorResource(id = R.color.blue),
                shape = RoundedCornerShape(5.dp)
            )
            .size(300.dp, 75.dp)
            .wrapContentHeight()
    )
}


@Composable
@Preview
fun TextForQuestionPreview() {
    TextForQuestion(text = "Test text")
}