package com.cricket.material.cricket;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.contrib.DrawerActions.openDrawer;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by smitald on 8/30/2015.
 */
@RunWith(AndroidJUnit4.class)
public class NavActivityTest {

    @Rule
    public ActivityTestRule<NavActivity> activityRule = new ActivityTestRule<>(NavActivity.class);

   /* @Test
    public void shouldBeAbleToLaunchMainScreen(){
        onView(withText("Hello")).check(matches(isDisplayed()));
    }*/

    /**
     * Test that clicking on a Navigation Drawer Item will open the correct fragment.
     * Espresso: openDrawer, onView, withText, perform, click, matches, check, isDisplayed
     */
    @Test
    public void testNavigationDrawerItemClick() {
        openDrawer(R.id.drawer_layout);
        onView(withText("Scores")).perform(click());
    }


    @Test
    public void testNavigationDrawerOpen() {
        openDrawer(R.id.drawer_layout);
    }
}
