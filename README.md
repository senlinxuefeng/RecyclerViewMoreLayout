# RecyclerViewMoreLayout
RecyclerView多种布局的使用，摒弃listview中嵌套girdview的方式<br>
##说明想要实现的效果是，0：单列，1：表示，三列，2：表示单列，<br>

实现的关键代码如下：<br>
 RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.rv);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 3);
        layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return recyclerViewAdapterBoard.getItemViewType(position) == 0 ? 3 : recyclerViewAdapterBoard.getItemViewType(position) == 1 ? 1 : 3;
            }
        });
        mRecyclerView.setLayoutManager(layoutManager);
此句代码是设置对应position位置的item的跨列数，比如第一行显示一列，其他行显示两列的代码实现如下：<br>
layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {  
            @Override  
            public int getSpanSize(int position) {  
                return position == 0 ? 2 : 1;  
            }  
        });

![](https://github.com/senlinxuefeng/RecyclerViewMoreLayout/raw/master/pictures/E3560D63-B506-4F0A-88C4-781285FC8590.png)<br>


###Developed By ywmingchuan@gmail.com


:blush:  :innocent:  :sunny:  :sunflower:  :blush:  :innocent:  :sunny:  :sunflower:  :blush:  :innocent:  :sunny:  :sunflower:  :blush:  :innocent:  :sunny:  :sunflower:  :blush:  :innocent:  :sunny:  :sunflower:  :blush:  :innocent:  :sunny:  :sunflower:  :blush: 
