package app.k9mail.core.ui.compose.designsystem.atom.textfield

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ExposedDropdownMenuBox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import app.k9mail.core.ui.compose.designsystem.atom.Icon
import app.k9mail.core.ui.compose.theme.Icons
import app.k9mail.core.ui.compose.theme.PreviewWithThemes
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

@Suppress("LongParameterList")
@Composable
fun <T> TextFieldOutlinedSelect(
    options: ImmutableList<T>,
    selectedOption: T,
    onValueChange: (T) -> Unit,
    modifier: Modifier = Modifier,
    label: String? = null,
    isEnabled: Boolean = true,
    isReadOnly: Boolean = false,
    isRequired: Boolean = false,
    hasError: Boolean = false,
) {
    TextFieldDropDownWrapper(
        isReadOnlyOrDisabled = isReadOnly || !isEnabled,
        options = options,
        onValueChange = onValueChange,
    ) { expanded ->
        TextFieldOutlined(
            value = selectedOption.toString(),
            onValueChange = { },
            label = label,
            trailingIcon = selectTrailingIcon(expanded),
            isEnabled = isEnabled,
            isReadOnly = true,
            isRequired = isRequired,
            hasError = hasError,
            modifier = Modifier
                .fillMaxWidth()
                .then(modifier),
        )
    }
}

private fun selectTrailingIcon(
    isExpanded: Boolean,
): @Composable () -> Unit {
    return if (isExpanded) {
        { Icon(Icons.Outlined.arrowDropUp) }
    } else {
        { Icon(Icons.Outlined.arrowDropDown) }
    }
}

@Composable
private fun <T> TextFieldDropDownWrapper(
    isReadOnlyOrDisabled: Boolean,
    options: ImmutableList<T>,
    onValueChange: (T) -> Unit,
    content: @Composable (expanded: Boolean) -> Unit,
) {
    if (isReadOnlyOrDisabled) {
        content(false)
    } else {
        DropDownMenu(
            options = options,
            onValueChange = onValueChange,
            content = content,
        )
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun <T> DropDownMenu(
    options: ImmutableList<T>,
    onValueChange: (T) -> Unit,
    content: @Composable (expanded: Boolean) -> Unit,
) {
    var expanded = remember { mutableStateOf(false) }

    ExposedDropdownMenuBox(
        expanded = expanded.value,
        onExpandedChange = {
            expanded.value = expanded.value.not()
        },
    ) {
        content(expanded.value)

        ExposedDropdownMenu(
            expanded = expanded.value,
            onDismissRequest = {
                expanded.value = false
            },
        ) {
            options.forEach { option ->
                DropdownMenuItem(
                    onClick = {
                        onValueChange(option)
                        expanded.value = false
                    },
                ) {
                    Text(text = option.toString())
                }
            }
        }
    }
}

@Preview
@Composable
internal fun TextFieldOutlinedSelectPreview() {
    PreviewWithThemes {
        TextFieldOutlinedSelect(
            options = persistentListOf("Option 1", "Option 2", "Option 3"),
            selectedOption = "Option 1",
            onValueChange = {},
        )
    }
}

@Preview
@Composable
internal fun TextFieldOutlinedSelectPreviewWithLabel() {
    PreviewWithThemes {
        TextFieldOutlinedSelect(
            options = persistentListOf("Option 1", "Option 2", "Option 3"),
            selectedOption = "Option 1",
            onValueChange = {},
            label = "Label",
        )
    }
}
