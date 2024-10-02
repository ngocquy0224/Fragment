<TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:text="Fragment"
        android:textColor="#00BCD4"
        android:textSize="20sp"
        android:textStyle="bold" />

    <Button
        android:id="@+id/btnBai1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:layout_marginBottom="10dp"
        android:text="Bai 1" />
mainActivity.xml


btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Bai1Activity.class);
                startActivity(intent);
            }
        });
mainActivity

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <Button
        android:id="@+id/btnHome"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Home" />

    <Button
        android:id="@+id/btnContact"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Contact" />

    <FrameLayout
        android:id="@+id/frContent"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />

</LinearLayout>
bai1Activity.xml


<TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:text="HOME FRAGMENT"
        android:textColor="#00BCD4"
        android:textSize="40sp" />
homefragment.xml


<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@android:color/holo_purple"
    tools:context=".fragment.ContactFragment">

    <!-- TODO: Update blank fragment layout -->
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:text="CONTACT FRAGMENT"
        android:textColor="#00BCD4"
        android:textSize="40sp" />

</RelativeLayout>
contactfragment


FrameLayout frameLayout;
    Button btnHome, btnContact;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai1);

        frameLayout = findViewById(R.id.frContent);
        btnHome = findViewById(R.id.btnHome);
        btnContact = findViewById(R.id.btnContact);

        fragmentManager = getSupportFragmentManager();

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Load HomeFragment when btnHome is clicked
                HomeFragment homeFragment = new HomeFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.frContent, homeFragment)
                        .commit();
            }
        });

        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Load ContactFragment when btnContact is clicked
                ContactFragment contactFragment = new ContactFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.frContent, contactFragment)
                        .commit();
            }
        });
    }
bai1Activity
