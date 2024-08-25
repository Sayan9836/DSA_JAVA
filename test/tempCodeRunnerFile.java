        int[] arr = {6,1,6,5,1,2,8,2,9,2,4};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int ele : arr) {
            map.put(ele, map.getOrDefault(ele,0)+1);
        }

        int cnt = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            cnt+=entry.getValue()/2;
        }

        System.out.println(cnt);