package com.example.lolaabudu.group_portfolio_hw_team_coding_heroes;

import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@RunWith(MockitoJUnitRunner.class)
public class ExampleUnitTest {
    @Mock
    private LolaProfileActivity lolaProfileActivity;
    @Mock
    private NaomyProfileActivity naomyProfileActivity;
    @Mock
    private SheriffProfileActivity sheriffProfileActivity;
    @Mock
    private Fribelsprofile fribelsprofile;
    @Mock
    private MainActivity mainActivity;


    @Before
    public void setUp() throws Exception {
        //MainActivity mainActivity = Mockito.mock(MainActivity.class);
        lolaProfileActivity = Mockito.mock(LolaProfileActivity.class);
        naomyProfileActivity = Mockito.mock(NaomyProfileActivity.class);
        sheriffProfileActivity = Mockito.mock(SheriffProfileActivity.class);
        fribelsprofile = Mockito.mock(Fribelsprofile.class);
        mainActivity = Mockito.mock(MainActivity.class);
    }

    @Test
    public void test_if_lola_profile_inflates_correct_menuLayout(){
        Menu menu1 = lolaProfileActivity.findViewById(R.menu.lola_menu);
        assertEquals(lolaProfileActivity.onCreateOptionsMenu(menu1), menu1);
    }

    @Test
    public void test_if_naomy_profile_inflates_correct_menuLayout(){
        Menu menu1 = naomyProfileActivity.findViewById(R.menu.naomy_popup_menu);
        assertEquals(naomyProfileActivity.onCreateOptionsMenu(menu1), menu1);
    }

    @Test
    public void test_if_sheriff_profile_inflates_correct_menuLayout(){
        Menu menu1 = sheriffProfileActivity.findViewById(R.menu.sheriff_menu);
        assertEquals(sheriffProfileActivity.onCreateOptionsMenu(menu1), menu1);
    }

    @Test
    public void test_if_fribel_profile_inflates_correct_menuLayout(){
        Menu menu1 = fribelsprofile.findViewById(R.menu.fribel_menu);
        assertEquals(fribelsprofile.onCreateOptionsMenu(menu1), menu1);
    }

    @Test
    public void test_if_main_profile_inflates_correct_menuLayout(){
        View menu1 = mainActivity.findViewById(R.id.coding_heroes_head);
        assertTrue(menu1.callOnClick());
    }

    @After
    public void tearDown() throws Exception {
        lolaProfileActivity = null;
        naomyProfileActivity = null;
        sheriffProfileActivity = null;
        fribelsprofile = null;
        mainActivity = null;
    }
}