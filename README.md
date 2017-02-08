#AndroidBottomDialog

An iOS-style bottom dialog.



#Usage

```java
final BottomSheet bottomSheet = BottomSheet
        .Builder
        .newBuilder(this)
        .setItem(new BottomSheet.MenuItem("edit", R.drawable.menu_edit,"edit"))
        .setItem(new BottomSheet.MenuItem("del", R.drawable.menu_del,"del"))
        .setItem(new BottomSheet.MenuItem("activity", R.drawable.menu_activity,"activity"))
        .setItem(new BottomSheet.MenuItem("edit", R.drawable.menu_edit,"edit"))
        .setItem(new BottomSheet.MenuItem("del", R.drawable.menu_del,"del"))
        .setItem(new BottomSheet.MenuItem("activity", R.drawable.menu_activity,"activity"))
        .build();
bottomSheet.setOnMenuItemClickListener(new OnMenuItemClickListener() {
    @Override
    public void onItemClick(BottomSheet.MenuItem item) {
        bottomSheet.dismiss();
        Toast.makeText(MainActivity.this,item.name,Toast.LENGTH_SHORT).show();
    }
});
bottomSheet.show();
```



#License

```
Copyright 2017 zjutkz

Licensed under the Apache License, Version 2.0 (the "License");you may not use this file except in compliance with the License.You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.See the License for the specific language governing permissions and limitations under the License.
```