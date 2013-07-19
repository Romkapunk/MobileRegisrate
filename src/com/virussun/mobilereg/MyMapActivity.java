package com.virussun.mobilereg;

import android.os.Bundle;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;


public class MyMapActivity extends MapActivity {
//private MapController mapController;
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_my_map);
final MapView mapView = (MapView) findViewById(R.id.my_map_view);
mapView.setBuiltInZoomControls(true);
mapView.displayZoomControls(true);

final MyLocationOverlay myLocationOverlay;
myLocationOverlay = new MyLocationOverlay(this, mapView);
myLocationOverlay.enableMyLocation();
mapView.getOverlays().add(myLocationOverlay);
}


@Override
protected boolean isRouteDisplayed() {
// �����: ���� ����� ������ ���������� true, ���� ���� ����������
// ���������� ����������� ��������. � ���� ������ �� ������
// ������� false.
return true;
}
}