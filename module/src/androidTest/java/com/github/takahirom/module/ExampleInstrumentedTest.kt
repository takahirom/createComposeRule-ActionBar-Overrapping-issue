package com.github.takahirom.minimal_test_35

import android.app.Activity
import androidx.compose.material3.Text
import androidx.compose.ui.platform.ViewRootForTest
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import androidx.core.view.drawToBitmap
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    val composeTestRule = createComposeRule()
    @Test
    fun useAppContext() {
        composeTestRule.setContent {
            Text("Hello\n\n\n\n\n\n\n\n\n\n World")
        }

        Thread.sleep(10000)
    }
}