package geert.berkers.botvavo.mainactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import geert.berkers.botvavo.mainactivity.screens.Home
import geert.berkers.botvavo.mainactivity.screens.Profile
import geert.berkers.botvavo.ui.theme.BotvavoTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val bottomBarItems = listOf(
            Screen.Home,
            Screen.Profile,
        )

        setContent {
            BotvavoTheme {
                val navController = rememberNavController()

                Scaffold(
                    // TODO: Fix the crash with the Bottom Navigation Bar?
                    // As soon as its commented, the app does not crash. Otherwise it crashes.
                    bottomBar = { BotvavoBottomBar(navController, bottomBarItems) }
                ) { paddingValues ->
                    Surface(modifier = Modifier.padding(paddingValues = paddingValues)) {
                        NavHost(navController, startDestination = Screen.Home.route) {
                            composable(Screen.Home.route) { Home(navController) }
                            composable(Screen.Profile.route) { Profile(navController) }
                        }
                    }
                }
            }
        }
    }
}

/* TODO: Check the crash log!
E/AndroidRuntime: FATAL EXCEPTION: main
    Process: geert.berkers.botvavo, PID: 12441
    java.lang.IllegalArgumentException: method androidx.compose.ui.graphics.Color.<init> argument 1 has type long, got androidx.compose.foundation.layout.RowScopeInstance
        at java.lang.reflect.Constructor.newInstance0(Native Method)
        at java.lang.reflect.Constructor.newInstance(Constructor.java:343)
        at androidx.compose.ui.inspection.inspector.InlineClassConverter$loadTypeMapper$1.invoke(InlineClassConverter.kt:54)
        at androidx.compose.ui.inspection.inspector.InlineClassConverter.castParameterValue(InlineClassConverter.kt:45)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.castValue(LayoutInspectorTree.kt:522)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.addParameter(LayoutInspectorTree.kt:514)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.addParameters(LayoutInspectorTree.kt:510)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.parse(LayoutInspectorTree.kt:417)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:330)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convertChildren(LayoutInspectorTree.kt:342)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:329)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:323)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:213)
        at androidx.compose.ui.inspection.inspector.LayoutInspectorTree.convert(LayoutInspectorTree.kt:115)
        at androidx.compose.ui.inspection.compose.AndroidComposeViewWrapper.<init>(AndroidComposeViewWrapper.kt:103)
        at androidx.compose.ui.inspection.compose.AndroidComposeViewWrapper$Companion.tryCreateFor(AndroidComposeViewWrapper.kt:85)
        at androidx.compose.ui.inspection.ComposeLayoutInspector$getAndroidComposeViews$3.invoke(ComposeLayoutInspector.kt:295)
E/AndroidRuntime:     at androidx.compose.ui.inspection.ComposeLayoutInspector$getAndroidComposeViews$3.invoke(ComposeLayoutInspector.kt:294)
        at kotlin.sequences.TransformingSequence$iterator$1.next(Sequences.kt:210)
        at kotlin.sequences.FilteringSequence$iterator$1.calcNext(Sequences.kt:170)
        at kotlin.sequences.FilteringSequence$iterator$1.hasNext(Sequences.kt:194)
        at kotlin.sequences.SequencesKt___SequencesKt.toCollection(_Sequences.kt:752)
        at kotlin.sequences.SequencesKt___SequencesKt.toMutableList(_Sequences.kt:782)
        at kotlin.sequences.SequencesKt___SequencesKt.toList(_Sequences.kt:773)
        at androidx.compose.ui.inspection.ComposeLayoutInspector.getAndroidComposeViews(ComposeLayoutInspector.kt:301)
        at androidx.compose.ui.inspection.ComposeLayoutInspector.access$getAndroidComposeViews(ComposeLayoutInspector.kt:64)
        at androidx.compose.ui.inspection.ComposeLayoutInspector$handleGetComposablesCommand$1.invoke(ComposeLayoutInspector.kt:128)
        at androidx.compose.ui.inspection.ComposeLayoutInspector$handleGetComposablesCommand$1.invoke(ComposeLayoutInspector.kt:125)
        at androidx.compose.ui.inspection.util.ThreadUtils$runOnMainThread$1.run(ThreadUtils.kt:47)
        at android.os.Handler.handleCallback(Handler.java:938)
        at android.os.Handler.dispatchMessage(Handler.java:99)
        at android.os.Looper.loop(Looper.java:233)
        at android.app.ActivityThread.main(ActivityThread.java:8010)
        at java.lang.reflect.Method.invoke(Native Method)
        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:631)
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:978)
 */