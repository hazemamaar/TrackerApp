package com.example.onboarding_presentation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.example.core_ui.LocalSpacing


@Composable
fun ActionButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String,
    isEnable: Boolean = true,
    textStyle: TextStyle = MaterialTheme.typography.button
) {

    Button(
        shape = RoundedCornerShape(100.dp),
        modifier = modifier,
        enabled = isEnable,
        onClick = onClick,
    ) {
        Text(
            text = text,
            style = textStyle,
            color = MaterialTheme.colors.onPrimary,
            modifier = Modifier.padding(
                LocalSpacing.current.spaceSmall
            )
        )
    }
}