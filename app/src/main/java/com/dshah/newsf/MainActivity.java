package com.dshah.newsf;
    import android.content.Intent;
    import android.os.Bundle;
    import android.support.design.widget.FloatingActionButton;
    import android.support.design.widget.Snackbar;
    import android.view.KeyEvent;
    import android.view.View;
    import android.support.design.widget.NavigationView;
    import android.support.v4.view.GravityCompat;
    import android.support.v4.widget.DrawerLayout;
    import android.support.v7.app.ActionBarDrawerToggle;
    import android.support.v7.app.AppCompatActivity;
    import android.support.v7.widget.Toolbar;
    import android.view.Menu;
    import android.view.MenuItem;
    import android.webkit.WebSettings;
    import android.webkit.WebView;
    import android.webkit.WebViewClient;

    public class MainActivity extends AppCompatActivity
            implements NavigationView.OnNavigationItemSelectedListener {
        public WebView w;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);


            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            drawer.setDrawerListener(toggle);
            toggle.syncState();

            NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
            navigationView.setNavigationItemSelectedListener(this);

            w=(WebView) findViewById(R.id.WebView);

                WebSettings w1=w.getSettings();
                w1.setJavaScriptEnabled(true);

                w.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
                w.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
                w.getSettings().setAppCacheEnabled(true);

                w.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                w1.setDomStorageEnabled(true);
                w1.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
                w1.setUseWideViewPort(true);
                w1.setSaveFormData(true);
                w1.setSavePassword(true);


                w.loadUrl("http://news.google.com");
                w.setWebViewClient(new WebViewClient());

        }

        @Override
        public  boolean onKeyDown(int keyCode, KeyEvent event){
            if((keyCode==KeyEvent.KEYCODE_BACK)&& this.w.canGoBack()) {
                this.w.goBack();
                return true;
            }
            return super.onKeyDown(keyCode,event);
        }

        @Override
        public void onBackPressed() {
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.about) {
            Intent i=new Intent(MainActivity.this,about.class) ;
                startActivity(i);
            }

            return super.onOptionsItemSelected(item);
        }

        @SuppressWarnings("StatementWithEmptyBody")
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            // Handle navigation view item clicks here.
            int id = item.getItemId();



            if (id == R.id.g1)
            { w.loadUrl("https://news.google.com");}

            else if (id == R.id.s1) {
                w.loadUrl("http://www.espncricinfo.com");

            }
            else if (id == R.id.s2) {
                w.loadUrl("http://www.skysports.com/football/news");

            }
            else if (id == R.id.s3) {
                w.loadUrl("http://sports.yahoo.com");

            }
            else if (id == R.id.b1) {
                w.loadUrl("https://www.forbes.com");

            }
            else if (id == R.id.b2) {
                w.loadUrl("http://www.cnbc.com/world");

            }
            else if (id == R.id.b3) {
                w.loadUrl("http://www.bloomberg.com");

            }
            else if (id == R.id.wr1) {
                w.loadUrl("https://weather.com");

            }
            else if (id == R.id.wr2) {
                w.loadUrl("http://m.accuweather.com");

            }
            else if (id == R.id.t1) {
                w.loadUrl("https://techcrunch.com");

            }
            else if (id == R.id.t2) {
                w.loadUrl("http://www.wired.com");

            }
            else if (id == R.id.t3) {
                w.loadUrl("http://mashable.com");

            }
            else if (id == R.id.e1) {
                w.loadUrl("http://m.eonline.com");

            }
            else if (id == R.id.e2) {
                w.loadUrl("http://m.indiatimes.com");

            }
            else if (id == R.id.m1) {
                w.loadUrl("http://www.spin.com");
            }
            else if (id == R.id.m2) {
                w.loadUrl("http://www.mtv.com");
            }
            else if (id == R.id.m3) {
                w.loadUrl("http://www.billboard.com");
            }



            else if (id == R.id.w1) {
                w.loadUrl("https://m.washingtonpost.com");

            }
            else if (id == R.id.w2) {
                w.loadUrl("http://mobile.nytimes.com");

            }
            else if (id == R.id.w3) {
                w.loadUrl("http://www.usatoday.com");
            }  else if (id == R.id.w4) {
                w.loadUrl("http://www.wsjin.com");

            }  else if (id == R.id.w5) {
                w.loadUrl("http://in.mobile.reuters.com");

            } else if (id == R.id.w6) {
                w.loadUrl("http://www.theguardian.com");

            } else if (id == R.id.w7) {
                w.loadUrl("http://www.dailymail.co.uk");

            } else if (id == R.id.w8) {
                w.loadUrl("http://www.mirror.co.uk");

            } else if (id == R.id.w9) {
                w.loadUrl("http://www.japantimes.co.jp");

            } else if (id == R.id.w10) {
                w.loadUrl("http://www.asahi.com");

            } else if (id == R.id.w11) {
                w.loadUrl("http://m.chinadaily.com.cn/en");

            } else if (id == R.id.w12) {
                w.loadUrl("http://mobile.shanghaidaily.com");

            } else if (id == R.id.w13) {
                w.loadUrl("http://mobile.lemonde.fr");

            } else if (id == R.id.w14) {
                w.loadUrl("http://www.lefigaro.fr");

            } else if (id == R.id.w15) {
                w.loadUrl("hhtp://www.smh.com.au");

            } else if (id == R.id.w16) {
                w.loadUrl("http://www.theage.com.au");

            } else if (id == R.id.w17) {
                w.loadUrl("http://www.larepublica.it");

            } else if (id == R.id.w18) {
                w.loadUrl("http://www.m.bild.de");

            } else if (id == R.id.w19) {
                w.loadUrl("http://www.otempo.com.br/super-noticia");

            }
            else if (id == R.id.w20) {
                w.loadUrl("http://english.aawsat.com");

            }
            else if (id == R.id.w21) {
                w.loadUrl("http://www.al-monitor.com");

            }
            else if (id == R.id.w22) {
                w.loadUrl("http://www.channelnewsasia.com");

            }
            else if (id == R.id.w23) {
                w.loadUrl("http://www.thejakartapost.com");

            }
            else if (id == R.id.w24) {
                w.loadUrl("http://m.bangkokpost.com");

            }
            else if (id == R.id.w25) {
                w.loadUrl("http://allafrica.com");

            }
            else if (id == R.id.w26) {
                w.loadUrl("http://m.news24.com");

            }



            else if (id == R.id.i1) {
                w.loadUrl("http://m.timesofindia.com");

            } else if (id == R.id.i2) {
                w.loadUrl("http://m.hindustantimes.com");

            } else if (id == R.id.i3) {
                w.loadUrl("http://www.dnaindia.com");

            } else if (id == R.id.i4) {
                w.loadUrl("http://m.ndtv.com");

            } else if (id == R.id.i5) {
                w.loadUrl("http://m.thehindu.com");

            } else if (id == R.id.i6) {
                w.loadUrl("http://indianexpress.com");

            } else if (id == R.id.i7) {
                w.loadUrl("http://m.mid-day.com");

            } else if (id == R.id.i8) {
                w.loadUrl("http://www.mumbaimirror.com");

            } else if (id == R.id.i9) {
                w.loadUrl("http://m.bhaskar.com");

            } else if (id == R.id.i10) {
                w.loadUrl("http://m.indiatoday.in");

            } else if (id == R.id.i11) {
                w.loadUrl("http://m.economictimes.com");

            }
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;
        }
    }
