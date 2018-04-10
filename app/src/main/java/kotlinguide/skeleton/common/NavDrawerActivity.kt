package kotlinguide.skeleton.common

import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.view.Menu
import android.view.MenuItem
import android.view.View
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

abstract class NavDrawerActivity : DaggerAppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

//    @Inject
//    lateinit var viewModelFactory: ViewModelProvider.Factory

    abstract val mToolbarMenu: Int?

    abstract val mTitle: Int?

    private lateinit var header: View

    abstract val mLayout: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mLayout)

        //Set the Nav Drawer
//        setSupportActionBar(toolbar)
//        val toggle = ActionBarDrawerToggle(
//                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
////        drawer_layout.addDrawerListener(toggle)
//        toggle.syncState()
//        nav_view.setNavigationItemSelectedListener(this)
//        header = nav_view.getHeaderView(0)
        supportActionBar?.title = getString(mTitle!!)

        //Init the view models and UI
        initialize()
    }

    private fun initialize() {
        initializeViewModels()
        initializeUI()
        observeLiveData()
    }

    abstract fun initializeUI()
    abstract fun initializeViewModels()
    abstract fun observeLiveData()

    override fun onBackPressed() {
//        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
//            drawer_layout.closeDrawer(GravityCompat.START)
//        } else {
            super.onBackPressed()
//        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        mToolbarMenu?.let {
            menuInflater.inflate(mToolbarMenu!!, menu)
            return true
        }
        return false
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
//            R.id.nav_change_parish -> {
//                startActivity(intentFor<SelectParishActivity>(Pair(OVERWRITE_PARISH, true)))
//                if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
//                    drawer_layout.closeDrawer(GravityCompat.START)
//                }
//                return false
//            }
        }
        return false
    }

    private fun setNavDrawerInformation() {

    }
}
